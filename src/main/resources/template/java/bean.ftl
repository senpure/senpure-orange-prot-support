package ${javaPackage};

<#list singleField?values as field>
    <#if !field.baseField>
        <#if field.bean.javaPackage!=javaPackage>
import ${field.bean.javaPackage}.${field.bean.javaName};
        </#if>
    </#if>
</#list >
import ww.protocol.Bean;
import zlib.io.ByteBuffer;

<#list fields as field>
    <#if field.list>
import java.util.List;
import java.util.ArrayList;

        <#break>
    </#if>
</#list>
/**<#if hasExplain>
 * ${explain}
 * </#if>
 ${sovereignty}
 * @time ${.now?datetime}
 */
<#assign name>${javaName}</#assign>
public class ${name} extends Bean {
<#include "field.ftl">

    @Override
    public String toString() {
        return "${name}<#if type!="NA">[${id?c}]</#if>{"
<#list fields as field>
                + "<#if field_index gt 0>,</#if>${field.name}=" + ${field.name}
</#list>
                + "}";
    }
<#include "toString.ftl">
}