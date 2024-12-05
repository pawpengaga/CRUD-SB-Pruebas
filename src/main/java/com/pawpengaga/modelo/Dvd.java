package com.pawpengaga.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dvd {

  // Puede existir mas a futuro una List<Cancion> canciones

  private String id;
  private String nombre;
  private String artista;
  private String anio_lanzamiento;
  private String genero;

}
