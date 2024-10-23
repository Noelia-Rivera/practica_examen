package pe.upeu.edu.Examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.upeu.edu.Examen.Dao.ProductoDao;
import pe.upeu.edu.Examen.entity.Producto;
import pe.upeu.edu.Examen.repository.ProductoRepository;

@Component
public class ProductoDaoImpl implements ProductoDao{
	@Autowired
	private ProductoRepository repository;
	
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
