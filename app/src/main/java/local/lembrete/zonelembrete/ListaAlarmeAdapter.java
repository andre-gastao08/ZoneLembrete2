package local.lembrete.zonelembrete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;



/**
 *
 * Adaptador para a lista de alarmes usado para os mostrar no ecrã do menu.
 * 
 */

public class ListaAlarmeAdapter extends BaseAdapter implements ListAdapter{

    private ArrayList<Alarme> list = new ArrayList<>();
    private Context context;

    public ListaAlarmeAdapter(ArrayList<Alarme> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        //return list.get(i).getId();
        return 0;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.alarme_elemento_lista, null);
        }

        //Handle TextView and display string from your list
        TextView listItemText = (TextView)view.findViewById(R.id.list_item_string);
        listItemText.setText(list.get(i).toString());

        //Handle buttons and edit onClickListeners
        Button deleteBtn = (Button)view.findViewById(R.id.delete_btn);
        Button edit_btn = (Button)view.findViewById(R.id.edit_btn);

        deleteBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TODO: Verificar se é necessário fazer mais alguma coisa aqui.
                list.remove(i); //or some other task
                notifyDataSetChanged();
            }
        });
        edit_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //TODO: Abrir actividade de editar o alarme.
                notifyDataSetChanged();
            }
        });

        return view;
    }
}
