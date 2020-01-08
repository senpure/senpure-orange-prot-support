<#assign baseFieldTypeMethodSpecialMap = {"int8":"byte","int16":"short",
"int32":"int","int64":"long","string":"UTF","String":"UTF","bool":"boolean"} />

<#function baseFieldType2MethodName fieldType>
    <#local temp>${baseFieldTypeMethodSpecialMap[fieldType]!fieldType}</#local>
    <#return temp?cap_first>
</#function>

