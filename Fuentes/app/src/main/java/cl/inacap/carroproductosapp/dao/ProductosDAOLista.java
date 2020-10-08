package cl.inacap.carroproductosapp.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.carroproductosapp.dto.Producto;

public class ProductosDAOLista implements ProductosDAO{
    //IMPLEMENTAR UN PATRON SINGLETON
    private List<Producto> productos = new ArrayList<>();
    //2. COMO ATRIBUTO DE LA MISMA CLASE DEBE EXISTIR UNA INSTANCIA ESTATICA DE SI MISMA
    private static ProductosDAOLista instancia;
    //1. CONSTRUCTOR DE LA CLASE DEBE SER PRIVADO
    private ProductosDAOLista(){
        Producto p = new Producto();
        p.setNombre("Coca Cola Zero");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fermentum fermentum elit sed dictum. Nullam eu auctor sapien. In vehicula erat ac mauris mollis congue. Proin in tortor vitae ipsum scelerisque cursus nec eget mauris. Aliquam sed tellus sit amet sem vulputate interdum. Nulla gravida nunc nisl. In molestie lobortis condimentum. Duis ullamcorper nibh vel risus egestas, a elementum turpis aliquam. Praesent venenatis, sapien in scelerisque finibus, sem nibh efficitur risus, dignissim placerat ligula mi at augue. Suspendisse potenti. Aenean dapibus lectus non maximus lacinia. Praesent imperdiet semper nisi vel lacinia. Fusce tellus elit, ornare eu efficitur a, porttitor nec nunc. Duis aliquet ut leo a rutrum.");
        p.setPrecio(1000);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/222233/711666.jpg?v=636541991139430000");
        productos.add(p);

        p.setNombre("Doritos");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fermentum fermentum elit sed dictum. Nullam eu auctor sapien. In vehicula erat ac mauris mollis congue. Proin in tortor vitae ipsum scelerisque cursus nec eget mauris. Aliquam sed tellus sit amet sem vulputate interdum. Nulla gravida nunc nisl. In molestie lobortis condimentum. Duis ullamcorper nibh vel risus egestas, a elementum turpis aliquam. Praesent venenatis, sapien in scelerisque finibus, sem nibh efficitur risus, dignissim placerat ligula mi at augue. Suspendisse potenti. Aenean dapibus lectus non maximus lacinia. Praesent imperdiet semper nisi vel lacinia. Fusce tellus elit, ornare eu efficitur a, porttitor nec nunc. Duis aliquet ut leo a rutrum.");
        p.setPrecio(1800);
        p.setFoto("https://www.chedraui.com.mx/medias/750101116773-00-CH1200Wx1200H?context=bWFzdGVyfHJvb3R8MTcxOTAzfGltYWdlL2pwZWd8aDliL2hmMS84ODIxMDAzOTc2NzM0LmpwZ3w2ZjE0MzIxYTNiYjU2NDhhN2VmNWY0ZDAwY2Y0ODkxZDhkZTIxZWE4NWQ3NzNhY2E1OTc4MzFkZDllYWIwNDhk");
        productos.add(p);

        p.setNombre("Galletas Toddy");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fermentum fermentum elit sed dictum. Nullam eu auctor sapien. In vehicula erat ac mauris mollis congue. Proin in tortor vitae ipsum scelerisque cursus nec eget mauris. Aliquam sed tellus sit amet sem vulputate interdum. Nulla gravida nunc nisl. In molestie lobortis condimentum. Duis ullamcorper nibh vel risus egestas, a elementum turpis aliquam. Praesent venenatis, sapien in scelerisque finibus, sem nibh efficitur risus, dignissim placerat ligula mi at augue. Suspendisse potenti. Aenean dapibus lectus non maximus lacinia. Praesent imperdiet semper nisi vel lacinia. Fusce tellus elit, ornare eu efficitur a, porttitor nec nunc. Duis aliquet ut leo a rutrum.");
        p.setPrecio(1600);
        p.setFoto("https://bugs.cl/wp-content/uploads/2018/04/fc_toddy_clasica_75gr.jpg");
        productos.add(p);

        p.setNombre("Shanne-Nuss");
        p.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean fermentum fermentum elit sed dictum. Nullam eu auctor sapien. In vehicula erat ac mauris mollis congue. Proin in tortor vitae ipsum scelerisque cursus nec eget mauris. Aliquam sed tellus sit amet sem vulputate interdum. Nulla gravida nunc nisl. In molestie lobortis condimentum. Duis ullamcorper nibh vel risus egestas, a elementum turpis aliquam. Praesent venenatis, sapien in scelerisque finibus, sem nibh efficitur risus, dignissim placerat ligula mi at augue. Suspendisse potenti. Aenean dapibus lectus non maximus lacinia. Praesent imperdiet semper nisi vel lacinia. Fusce tellus elit, ornare eu efficitur a, porttitor nec nunc. Duis aliquet ut leo a rutrum.");
        p.setPrecio(2100);
        p.setFoto("https://jumbo.vteximg.com.br/arquivos/ids/324250/Principal-7136.jpg?v=637153902477430000");
        productos.add(p);

    }

    //3. METODO ESTATICO QUE PERMITA EL ACCESO A LA UNICA INSTANCIA
    public static ProductosDAOLista getInstance(){
        if(instancia==null){
            instancia=new ProductosDAOLista();
        }
        return instancia;
    }


    @Override
    public List<Producto> getAll() {
        return productos;
    }

    @Override
    public Producto save(Producto p) {
        productos.add(p);
        return p;
    }
}
