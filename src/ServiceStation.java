public class ServiceStation implements Service{

      @Override
      public void check(Transport transport) {
      transport.checkTransport();
      }
}
