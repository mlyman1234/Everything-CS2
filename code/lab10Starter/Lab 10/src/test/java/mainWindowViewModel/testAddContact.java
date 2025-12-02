package mainWindowViewModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import edu.westga.cs1302.contact_manager.model.Contact;
import edu.westga.cs1302.contact_manager.viewmodel.MainWindowViewModel;

public class testAddContact {
	
	
	@Test
	public void ifDuplicateFound() {
		MainWindowViewModel vm = new MainWindowViewModel();
		vm.getName().set("S");
		vm.getPhoneNumber().set("999-9999");
		vm.addContact();
		vm.getName().set("S");
		vm.getPhoneNumber().set("999-9999");
		assertThrows(IllegalArgumentException.class, () -> {
			vm.addContact();
		});
	}
		
		@Test
		public void addMultiple() {
			MainWindowViewModel vm = new MainWindowViewModel();
			vm.getName().set("S");
			vm.getPhoneNumber().set("999-9999");
			vm.addContact();
			vm.getName().set("M");
			vm.getPhoneNumber().set("999-9599");
			vm.addContact();
			assertFalse(vm.getContacts().isEmpty());
			vm.getSearchCriteria().setValue("S");
			assertEquals(vm.findContact(), "S, 999-9999");
			vm.getSearchCriteria().setValue("M");
			assertEquals(vm.findContact(), "M, 999-9599");

			
	}

}
