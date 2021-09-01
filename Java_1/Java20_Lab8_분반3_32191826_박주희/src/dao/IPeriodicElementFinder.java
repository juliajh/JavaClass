//Lab8, 3분반, 6/10, 32191826, 박주희

package dao;
import java.util.function.Predicate;
import dto.PeriodicElement;

interface IPeriodicElementFinder {
	PeriodicElement findElement(Predicate<PeriodicElement>predicate);
	PeriodicElement[] findElements(Predicate<PeriodicElement>predicate);
}
