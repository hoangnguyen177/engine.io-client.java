# Engine.IO-client.java
[![Build Status](https://travis-ci.org/nkzawa/engine.io-client.java.png?branch=master)](https://travis-ci.org/nkzawa/engine.io-client.java)

This is the Engine.IO Client Library for Java, which is simply ported from the [JavaScript client](https://github.com/LearnBoost/engine.io-client).

See also: [Socket.IO-client.java](https://github.com/nkzawa/socket.io-client.java)

## Usage
Engine.IO-client.java has the similar api with the JS client. You can use `Socket` to connect:

```java
socket = new Socket("ws://localhost") {
  @Override
  public void onopen() {
    socket.send("hi");
    socket.close();
  }

  @Override
  public void onmessage(String data) {}

  @Override
  public void onclose() {}
};
socket.open();
```

You can receive events as follows:

```java
socket.on(Socket.EVENT_ERROR, new Emitter.Listener() {
  @Override
  public void call(Object... args) {
    Exception err = (Exception)args[0];
  }
});
```

How to set options:

```java
opts = new Socket.Options();
opts.cookie = "foo=1;";

socket = new Socket("ws://localhost", opts) { ... };
```

See the Javadoc for more details.

http://nkzawa.github.io/engine.io-client.java/apidocs/


## Features
This library supports all of the features the JS client does, including events, options and upgraging transport.

## License

MIT

