package ${javaHandlerPackage};

import com.wuxia.prot.AbstractPort;
import com.wuxia.server.CommandResponseExecutor;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;
<#list fileChildren as bean>
import ${bean.javaPackage}.${bean.response.javaName};
</#list>

/**
 *
 ${sovereignty}
 * @time ${.now?datetime}
 */
@Component
public class ${portName} extends AbstractPort {

<#list fileChildren as bean>
    <#if bean.hasExplain>
    //${bean.explain}
    </#if>
    public void execute${bean.response.javaName}(Channel channel, ${bean.response.javaName} message) {
        //TODO

    }

</#list>

    @Override
    public int handlerId() {
        return ${response.javaName}.PORT;
    }

    public ${portName}() {
<#list fileChildren as bean>
        regCommandMessageExecutor(${bean.response.javaName}.COMMAND,${bean.response.javaName}::new);
        regCommandResponseExecutor(${bean.response.javaName}.COMMAND,
            (CommandResponseExecutor<${bean.response.javaName}>)
                this::execute${bean.response.javaName});

</#list>
    }

}