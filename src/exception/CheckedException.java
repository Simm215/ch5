package exception;

public class CheckedException extends Exception {
        public CheckedException (String message){
            super("New CheckedException"+ message);
        }
    }

