package le.data.scs.spider.distribution.mq;

import le.data.scs.spider.serialization.Serialization;
import le.data.scs.spider.serialization.support.JsonSerialization;

/**
 * Created by yangyong3 on 2017/2/21.
 */
public abstract class AbstractMessageQueue<T> implements MessageQueue<T> {

    protected String queueName;

    protected Serialization<T,String> jsonSerialization = new JsonSerialization<T>();

    protected void checkMessage(Object object) throws MQException {
        if (object == null)
            throw new MQException(object + " message is null ");
    }

    public AbstractMessageQueue(String queueName) {
        this.queueName = queueName;
    }
}
