package homeworkcolcul23.homeworkcolcul23.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroDevideException extends IllegalArgumentException{


}
