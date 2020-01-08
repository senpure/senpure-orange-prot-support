package ${javaHandlerPackage};

import ww.player.Player;
import ww.protocol.CommandRequestExecutor;
<#list fileChildren as bean>
import ${bean.javaPackage}.${bean.javaName};
import ${bean.javaPackage}.${bean.response.javaName};
</#list>

/**
 *
 ${sovereignty}
 * @time ${.now?datetime}
 */
public class ${portName} extends AbstractPort {

<#list fileChildren as bean>
    <#if bean.hasExplain>
    //${bean.explain}
    </#if>
    public ${bean.response.javaName} execute${bean.javaName}(Player player, ${bean.javaName} request) {
        ${bean.response.javaName} response = new  ${bean.response.javaName}();
        //TODO ${bean.javaName} request

        return response;
    }

</#list>

    @Override
    public int getPort() {
        return ${javaName}.PORT;
    }

    public ${portName}() {
<#list fileChildren as bean>
        regCommandMessageExecutor(${bean.javaName}.COMMAND, () -> new ${bean.javaName}());
        regCommandRequestExecutor(${bean.javaName}.COMMAND,
            (CommandRequestExecutor<${bean.javaName}, ${bean.response.javaName}>)
                (player, request) -> execute${bean.javaName}(player, request));

</#list>
    }

}