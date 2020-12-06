package Domain;
import Abstraction.Types;
public class Adapter implements Types{
    TypesAdapter typesAdapter;

    @Override
    public void add(String type) {
            typesAdapter = new TypesAdapter(type);
            typesAdapter.add(type);
    }
}
