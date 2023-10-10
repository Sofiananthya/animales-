Private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt){
    
    //TODO add your handling code here;
    string mensaje="Animales elegidos: ";

    if (chkPerro.isSelected()){
       mensaje=mensaje+"Perro"; 
}
    if(chkGato.isSelected()){
       mensaje=mensaje+"Gato";

}

    if(chkRaton.isSelected()){
       mensaje=mensaje+"Raton";
}
lblMensaje.setText(text:mensaje);

