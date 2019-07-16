package com.example.anoop.mymap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HospitalList extends AppCompatActivity {

    private ListView lvProduct;
   /* lvProduct=(ListView)findViewById(R.id.)

 /*

    private ListView lvProduct;
    private ProductListAdapterMob adapter;
    private List<ProductMobNumbers> mProductList;
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_list);
    }

  /*  lvProduct=(ListView)findViewById(R.id.);
    mProductList=new ArrayList<>();

    //add sample data for list

    mProductList.add(new ProductMobNumbers(1,"Principal","04662260350"));
    mProductList.add(new ProductMobNumbers(2,"Prof.Anwar Hussain \n(EC HOD)","9495822605"));
    mProductList.add(new ProductMobNumbers(3,"Prof.Vinayachandran K K \n(IT HOD)","9656184648"));
    mProductList.add(new ProductMobNumbers(4,"Prof.Rafeek P C \n(CS HOD)","9495785370"));
    mProductList.add(new ProductMobNumbers(5,"Prof.Jamshidali \n(Physics)","9846272290"));
    mProductList.add(new ProductMobNumbers(6,"Prof.Ranju V Sankar \n(Mathematics HOD)","9037189624"));
    mProductList.add(new ProductMobNumbers(7,"Prof.Aneesh \n(Civil)","9446148112"));





    //init adapter
    adapter =new ProductListAdapterMob(getApplicationContext(),mProductList);
    lvProduct.setAdapter(adapter);

    lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            //do some thing
            Intent callIntent=new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:"+(String)view.getTag()));
            startActivity(callIntent);
            //Toast.makeText(getApplicationContext(),"Number =" + (String)view.getTag(),Toast.LENGTH_SHORT).show();

        }
    });*/

}
