package pe.upeu.edu.Examen.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.upeu.edu.Examen.Dao.ClienteDao;
import pe.upeu.edu.Examen.entity.Cliente;
import pe.upeu.edu.Examen.repository.ClienteRepository;

@Component
public class ClienteDaoImpl implements ClienteDao{
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
