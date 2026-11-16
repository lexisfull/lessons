import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ATM {


    private final Map<String,  Map<Integer, Integer>> currencies;

    public ATM(Map<String, Map<Integer, Integer>> initialBanknotes) {
        this.currencies = new HashMap<>();
        for (String cur : initialBanknotes.keySet()) {
            currencies.put(cur, new HashMap<>(initialBanknotes.get(cur)));
        }
    }



    private final Set<String> permissibleCurrency = Set.of("RUB", "EUR");

    public Map<Integer, Integer> withdraw(int sum, String currency) {
        if(!permissibleCurrency.contains(currency)) {
            return null;
        }
        if (sum <= 0) {
            return null;
        }
        Map<Integer, Integer> currentCurrency = currencies.get(currency);
        if (currentCurrency == null || currentCurrency.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> giveOut = new HashMap<>();
        List<Integer> denominations = new ArrayList<>(currentCurrency.keySet());
        denominations.sort(Comparator.reverseOrder());
        for (int nom : denominations) {
            int needed = sum / nom;
            int available = currentCurrency.get(nom);
            int count = Math.min(needed, available);
            sum -= count * nom;
            if (count > 0) {
                giveOut.put(nom, count);
            }
            if (sum == 0) {
                break;
            }
        }
        if (sum > 0) {
            return null;
        }
        for (int nom : giveOut.keySet()) {
            int currentCunt = currentCurrency.get(nom) - giveOut.get(nom);
            currentCurrency.put(nom, currentCunt);
        }
        return giveOut;
    }
}
