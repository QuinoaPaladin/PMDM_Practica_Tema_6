package es.studium.myfilmingapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListaPelis#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaPelis extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ArrayList<Anime> listaPeli;
    RecyclerView recyclerPeli;

    public ListaPelis() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Lista.
     */
    // TODO: Rename and change types and number of parameters
    public static ListaPelis newInstance(String param1, String param2) {
        ListaPelis fragment = new ListaPelis();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista=inflater.inflate(R.layout.fragment_lista, container, false);

        recyclerPeli = (RecyclerView) vista.findViewById(R.id.recyclerId);
        listaPeli= new ArrayList();
        recyclerPeli.setLayoutManager(new LinearLayoutManager(getContext()));

        llenarLista();

        PelisAdapter adapterPelis=new PelisAdapter(listaPeli);
        recyclerPeli.setAdapter(adapterPelis);
        return vista;
    }

    private void llenarLista() {
        listaPeli.add(new Anime(R.drawable.castillo, "El castillo ambulante", 5364));
        listaPeli.add(new Anime(R.drawable.viaje, "El viaje de Chihiro", 6452));
        listaPeli.add(new Anime(R.drawable.princesa, "La princesa Mononoke", 9756));
        listaPeli.add(new Anime(R.drawable.porco, "Porco Rosso", 6451));
        listaPeli.add(new Anime(R.drawable.nicky, "Nicky la aprendiz de bruja", 4590));
    }
}