package exception;


public class SomeClass {
    public void methodUncheckedException(int i){
        if(i==0){
            UncheckedException e = new UncheckedException("created in methodUncheckedException . Devide by 0");
            throw e;
        }
        System.out.println("aftr unch exc" + 5/i);
    }

    public void methodCheckedException(int i) throws CheckedException{
        if(i==2){
            CheckedException ce = new CheckedException("nr 2 not accepted");
            throw ce;
        }
    }


}