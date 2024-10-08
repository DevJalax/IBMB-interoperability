public interface BankingService {
    void processTransaction();
    void validate();
    void handleSession();
    void authUser();
}

@Service("mobileService")
public class MobileBankingService implements BankingService {
    @Override
    public void processTransaction() {
        System.out.println("Processing transaction for mobile banking.");
    }
}

@Service("webService")
public class WebBankingService implements BankingService {
    @Override
    public void processTransaction() {
        System.out.println("Processing transaction for web banking.");
    }
}
