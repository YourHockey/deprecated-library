package vakoom.gunmarket.ru;

import java.time.LocalDateTime;
import java.time.ZoneId;


public class TimeService {
	public static LocalDateTime utcNow() {
		return LocalDateTime.now(ZoneId.of("UTC"));
	}
}
