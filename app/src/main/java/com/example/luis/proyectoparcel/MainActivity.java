package com.example.luis.proyectoparcel;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    ListView lista;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Modelo> model=new ArrayList<>();

        Modelo m= new  Modelo();
        m.setNombre("Nombre 1");
        m.setDescripcion("Mi Descripcion 1");
        m.setCodigo(1);
        model.add(m);

        m= new  Modelo();
        m.setNombre("Nombre 2");
        m.setDescripcion("Mi Descripcion 2");
        m.setCodigo(2);
        model.add(m);

        adapter=new Adapter(this,model);

        lista = (ListView)findViewById(R.id.ma_lv_lista);
        lista.setAdapter(adapter);
        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                try {
                    Modelo modelo=(Modelo) adapter.getItem(position);
                    Log.e("modelo", modelo.getCodigo()+"-"+modelo.getNombre());
                } catch (Exception e){
                    e.printStackTrace();
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
