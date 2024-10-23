package pe.upeu.edu.Examen.Dao;

import java.util.List;
import java.util.Optional;

import pe.upeu.edu.Examen.entity.Producto;


public interface ProductoDao {
	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> read(Long id);
	List<Producto> readAll();
}
