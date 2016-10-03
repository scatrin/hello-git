import java.lang.OutputStream;

public class Hello {
  /**
   * A constructor.
   */
  public Hello(final OutputStream outputStream) {
    this.outputStream = outputStream;
  }

  public void hello(final String message) {
    System.out.println("Hello " + message);
  }
}
