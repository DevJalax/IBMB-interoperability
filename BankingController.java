@RestController
public class BankingController {

    @Autowired
    @Qualifier("mobileService")
    private BankingService mobileBankingService;

    @Autowired
    @Qualifier("webService")
    private BankingService webBankingService;

    @GetMapping("/transaction")
    public ResponseEntity<String> handleTransaction(HttpServletRequest request) {
        String clientType = (String) request.getAttribute("clientType");

        if ("mobile".equals(clientType)) {
            mobileBankingService.processTransaction();
        } else {
            webBankingService.processTransaction();
        }

        return ResponseEntity.ok("Transaction processed for " + clientType + " client.");
    }
}
