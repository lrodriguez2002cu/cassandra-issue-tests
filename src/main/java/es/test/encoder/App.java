package es.test.encoder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
  /*
  *  at org.codehaus.jackson.io.JsonStringEncoder.quoteAsString(JsonStringEncoder.java:141) ~[jackson-core-a
  *  at org.apache.cassandra.cql3.Json.quoteAsJsonString(Json.java:45) ~[apache-cassandra-3.11.0.jar:3.11.0]
  *  at org.apache.cassandra.db.marshal.UTF8Type.toJSONString(UTF8Type.java:66) ~[apache-cassandra-3.11.0.ja
  *  at org.apache.cassandra.cql3.selection.Selection.rowToJson(Selection.java:291) ~[apache-cassandra-3.11.
  *  at org.apache.cassandra.cql3.selection.Selection$ResultSetBuilder.getOutputRow(Selection.java:431) ~[ap
  *  at org.apache.cassandra.cql3.selection.Selection$ResultSetBuilder.build(Selection.java:417) ~[apache-ca
  *  at org.apache.cassandra.cql3.statements.SelectStatement.process(SelectStatement.java:763) ~[apache-cass
  *  at org.apache.cassandra.cql3.statements.SelectStatement.processResults(SelectStatement.java:400) ~[apac
  *  at org.apache.cassandra.cql3.statements.SelectStatement.execute(SelectStatement.java:378) ~[apache-cass
   *  at org.apache.cassandra.cql3.statements.SelectStatement.execute(SelectStatement.java:251) ~[apache-cass
   *  at org.apache.cassandra.cql3.statements.SelectStatement.execute(SelectStatement.java:79) ~[apache-cassa
   *  at org.apache.cassandra.cql3.QueryProcessor.processStatement(QueryProcessor.java:217) ~[apache-cassandr
   *  at org.apache.cassandra.cql3.QueryProcessor.process(QueryProcessor.java:248) ~[apache-cassandra-3.11.0.
  *  at org.apache.cassandra.cql3.QueryProcessor.process(QueryProcessor.java:233) ~[apache-cassandra-3.11.0.
  *  at org.apache.cassandra.transport.messages.QueryMessage.execute(QueryMessage.java:116) ~[apache-cassand        at org.apache.cassandra.transport.Message$Dispatcher.channelRead0(Message.java:517) [apache-cassandra-3        at org.apache.cassandra.transport.Message$Dispatcher.channelRead0(Message.java:410) [apache-cassandra-3        at io.netty.channel.SimpleChannelInboundHandler.channelRead(SimpleChannelInboundHandler.java:105) [nett
  */
    System.out.println("Hello World!");
    }
}
