# TareaAcademica2

En primer lugar, cree una arquitectura que pueda ser seteada de manera dinamica, los titulos de las pantallas asi como el contenido.
En segundo lugar, la parte del sidebar, utilice un nav_header_main.xml y que se va llenando con los valores ingresados el folder menu archivo activity_home_drawer.xml
Cuando presionas una opcion del menu, llama a un fragment especifico que es llamado desde el activity. Todo esto se encuentra dentro de la carpeta ui.
Por ultimo, dentro del xml del service (fragment_service.xml) coloque un RecyclerView que esta llamando un xml layout_item_service_field.xml, dentro de este se encuentra el CardView. En la clase ServiceFieldAdapter se implemento la logica, setear la lista del cardview.
