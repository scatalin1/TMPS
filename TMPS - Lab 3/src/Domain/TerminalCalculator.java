package Domain;

import Abstraction.PowerCalculator;

public class TerminalCalculator implements PowerCalculator {

    private PowerCalculator elementalPower;
    private PowerCalculator typePower;

    public TerminalCalculator(PowerCalculator elementalPower, PowerCalculator typePower) {
        this.elementalPower = elementalPower;
        this.typePower = typePower;
    }

    @Override
    public int calculate() {
        return 5 * elementalPower.calculate() + typePower.calculate();
    }
}
