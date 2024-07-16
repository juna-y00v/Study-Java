package exception.ex4.exception;

public class ConnectException4 extends NetworkClientExceptionV4 {

    private final String address;

    public ConnectException4(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
