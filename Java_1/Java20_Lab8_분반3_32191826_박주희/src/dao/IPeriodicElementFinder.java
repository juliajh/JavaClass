//Lab8, 3�й�, 6/10, 32191826, ������

package dao;
import java.util.function.Predicate;
import dto.PeriodicElement;

interface IPeriodicElementFinder {
	PeriodicElement findElement(Predicate<PeriodicElement>predicate);
	PeriodicElement[] findElements(Predicate<PeriodicElement>predicate);
}
