<#global "int"="Integer"/>
    <#include "method.ftl"/>
<#list fields as field>
<#if field.hasExplain>
    //${field.explain}
</#if>
<#if field.list >
    private List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
<#else>
    <#if !field.baseField&&field.bean.enum>
    private ${field.javaType} ${field.name} = ${field.bean.javaName}.${field.bean.defaultField.name};
        <#else >
    private ${field.javaType} ${field.name};
    </#if>
</#if>
</#list>

    public void copy(${javaName} from) {
<#list fields as field>
    <#if field.list >
        this.${field.name}.clear();
        <#if field.baseField ||field.bean.enum>
        this.${field.name}.addAll(from.get${field.name?cap_first}());
        <#else >
        for (int i = 0; i < from.get${field.name?cap_first}().size(); i++) {
            ${field.javaType} ${lowerCamelCase(field.javaType)} = new ${field.javaType}();
            ${lowerCamelCase(field.javaType)}.copy(from.get${field.name?cap_first}().get(i));
            this.${field.name}.add(${lowerCamelCase(field.javaType)});
        }
        </#if>
    <#else>
        <#if field.baseField ||field.bean.enum>
            <#if field.javaType="boolean">
        this.${field.name} = from.is${field.name?cap_first}();
            <#else >
        this.${field.name} = from.get${field.name?cap_first}();
            </#if>
        <#else>
        ${field.javaType} temp${field.name?cap_first} = new ${field.javaType}();
        temp${field.name?cap_first}.copy(from.get${field.name?cap_first}());
        this.${field.name} = temp${field.name?cap_first};
        </#if>
    </#if>
    </#list>
    }

    /**
     * 写入字节缓存
     */
    @Override
    public void write(ByteBuffer data) {
<#list fields as field>
    <#if field.hasExplain>
        //${field.explain}
    </#if>
    <#if field.list >
        data.writeShort(${field.name}.size());
        for (${.globals[field.javaType]!field.javaType?cap_first} temp${field.name?cap_first}Bean : ${field.name}) {
        <#if field.baseField>
            data.write${baseFieldType2MethodName(field.fieldType)}(temp${field.name?cap_first}Bean);
            <#else >
                <#if field.bean.enum>
                <#else >
            temp${field.name?cap_first}Bean.write(data);
                </#if>
        </#if>
        }
    <#else ><#--不是list-->
        <#if field.baseField>
            <#if field.javaType="String">
        if (this.${field.name} != null) {
            data.writeUTF(this.${field.name});
        } else {
           data.writeUTF("");
        }
            <#else>
        data.write${baseFieldType2MethodName(field.fieldType)}(this.${field.name});
            </#if>
        <#else ><#--bean eunm-->
            <#if field.bean.enum>
        if (this.${field.name} != null) {
            writeInt(this.${field.name}.getValue());
        }
            <#else>
        if (this.${field.name} != null) {
            this.${field.name}.write(data);
        } else{
            new ${field.bean.javaName}().write(data);
        }
            </#if>
        </#if>
    </#if>
</#list>
    }

    /**
     * 读取字节缓存
     */
    @Override
    public void read(ByteBuffer data) {
<#list fields as field>
<#if field.hasExplain>
        //${field.explain}
</#if>
    <#if field.list>
        int temp${field.name?cap_first}Len = data.readShort();
        for (int i = 0; i < temp${field.name?cap_first}Len; i++) {
        <#if field.baseField>
            ${field.name}.add(data.read${baseFieldType2MethodName(field.fieldType)}());
        <#else >
            <#if field.bean.enum>
            <#else >
            ${field.javaType} temp${field.name?cap_first}Bean = new ${field.javaType}();
            temp${field.name?cap_first}Bean.read(data);
            ${field.name}.add(temp${field.name?cap_first}Bean);
            </#if>
        </#if>
        }
    <#else><#--不是list-->
         <#if field.baseField>
        this.${field.name} = data.read${baseFieldType2MethodName(field.fieldType)}();
        <#else >
            <#if field.bean.enum>
            <#else >
        ${field.javaType} temp${field.name?cap_first}Bean = new ${field.javaType}();
        temp${field.name?cap_first}Bean.read(data);
        this.${field.name} = temp${field.name?cap_first}Bean;
            </#if>
        </#if>
    </#if>
</#list>
    }

<#list fields as field>
    <#if field.list>
        <#if field.hasExplain&&field.explain?length gt 1>
     /**
      * get ${field.explain}
      *
      * @return
      */
        </#if>
    public List<${.globals[field.javaType]!field.javaType?cap_first}> get${field.name?cap_first}() {
        return ${field.name};
    }

        <#if field.hasExplain&&field.explain?length gt 1>
     /**
      * set ${field.explain}
      */
        </#if>
    public ${name} set${field.name?cap_first}(List<${.globals[field.javaType]!field.javaType?cap_first}> ${field.name}) {
        if (${field.name} == null) {
            this.${field.name} = new ArrayList(<#if field.capacity gt 0>${field.capacity}</#if>);
            return this;
        }
        this.${field.name} = ${field.name};
        return this;
    }

    <#else>
        <#if field.hasExplain&&field.explain?length gt 1>
    /**
     * <#if field.javaType="boolean">is<#else>get</#if> ${field.explain}
     *
     * @return
     */
        </#if>
    public ${field.javaType} <#if field.javaType="boolean">is<#else>get</#if>${field.name?cap_first}() {
        return ${field.name};
    }

        <#if field.hasExplain&&field.explain?length gt 1>
    /**
     * set ${field.explain}
     */
        </#if>
    public ${name} set${field.name?cap_first}(${field.javaType} ${field.name}) {
        this.${field.name} = ${field.name};
        return this;
    }

    </#if>
</#list>