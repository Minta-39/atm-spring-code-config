package atm.ac.th;

import java.util.Map;

public interface DataSource {
    Map<Integer, Customer> readCustomers();
}
