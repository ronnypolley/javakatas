package dateKata;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class DateKata {

	public static void main(String[] args) {
		TemporalAdjuster fridy13Adjuster = temporal -> {
			temporal = temporal.with(ChronoField.DAY_OF_MONTH, 13);

			while (temporal.get(ChronoField.DAY_OF_WEEK) != DayOfWeek.FRIDAY
					.getValue()) {
				temporal = temporal.plus(1, ChronoUnit.MONTHS);
			}

			return temporal;
		};

		System.out.println(LocalDate.now().with(fridy13Adjuster));
	}
}
