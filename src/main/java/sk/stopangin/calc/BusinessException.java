package sk.stopangin.calc;

public class BusinessException extends RuntimeException {
    public BusinessException(ERR error) {
        super(error.detail);
    }

    public enum ERR {
        DIVISION_BY_ZERO("division by zero");

        ERR(String detail) {
            this.detail = detail;
        }

        private String detail;
    }
}
