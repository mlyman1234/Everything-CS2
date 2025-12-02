package mainWindowViewModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.contact_manager.viewmodel.MainWindowViewModel;

public class testFindContact {

	@Test
	public void ifSearchCriteriaIsNotValid() {
		MainWindowViewModel vm = new MainWindowViewModel();
		vm.getName().set("S");
		vm.getPhoneNumber().set("999-9999");
		vm.addContact();
		assertThrows(IllegalArgumentException.class, () -> {
			vm.getSearchCriteria().setValue("999999999");
		});
	}
	
	@Test
	public void findingForPhoneNumber() {
		MainWindowViewModel vm = new MainWindowViewModel();
		vm.getName().set("S");
		vm.getPhoneNumber().set("999-9999");
		vm.addContact();
		vm.getName().set("M");
		vm.getPhoneNumber().set("999-9959");
		vm.addContact();
		vm.getName().set("L");
		vm.getPhoneNumber().set("899-9999");
		vm.addContact();
		vm.getSearchCriteria().setValue("999-9999");
		assertEquals(vm.findContact(), "S, 999-9999");
		vm.getSearchCriteria().setValue("999-9959");
		assertEquals(vm.findContact(), "M, 999-9959");
		vm.getSearchCriteria().setValue("899-9999");
		assertEquals(vm.findContact(), "L, 899-9999");

	}
	
	@Test
	public void findingForName() {
		MainWindowViewModel vm = new MainWindowViewModel();
		vm.getName().set("S");
		vm.getPhoneNumber().set("999-9999");
		vm.addContact();
		vm.getName().set("M");
		vm.getPhoneNumber().set("999-9959");
		vm.addContact();
		vm.getName().set("L");
		vm.getPhoneNumber().set("899-9999");
		vm.addContact();
		vm.getSearchCriteria().setValue("S");
		assertEquals(vm.findContact(), "S, 999-9999");
		vm.getSearchCriteria().setValue("M");
		assertEquals(vm.findContact(), "M, 999-9959");
		vm.getSearchCriteria().setValue("L");
		assertEquals(vm.findContact(), "L, 899-9999");

	}
}
