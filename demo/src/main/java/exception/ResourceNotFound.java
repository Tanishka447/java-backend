package exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class resource extends  RuntimeException {
    public  resource(String message){
        super(message);
    }
}