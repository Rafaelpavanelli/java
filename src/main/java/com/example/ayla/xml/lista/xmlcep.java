package com.example.ayla.xml.lista;

import javax.xml.bind.annotation.*;
@XmlRootElement
public class xmlcep {
private Enderecos enderecos;
public Enderecos getEnderecos() {
return enderecos;
}
public void setEnderecos(Enderecos enderecos) {
this.enderecos = enderecos;
}
}
