package ${javaHandlerPackage};

import ${javaPackage}.${javaName};
import com.senpure.io.consumer.handler.AbstractConsumerMessageHandler;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

/**<#if hasExplain>
 * ${explain}处理器
 *</#if>
 ${sovereignty}
 * @time ${.now?datetime}
 */
@Component
public class ${javaHandlerName} extends AbstractConsumerMessageHandler<${javaName}> {

    @Override
    public void execute(Channel channel, ${javaName} message) {
        //TODO 请在这里写下你的代码

    }

    @Override
    public int handlerId() {
               // ${.now?datetime} ${id?c}
        return ${javaName}.MESSAGE_ID;
    }

    @Override
    public ${javaName} getEmptyMessage() {
        return new ${javaName}();
    }

}