package ezwowm.ezwowm.services;

import ezwowm.ezwowm.dto.UsuarioDTO;
import ezwowm.ezwowm.model.Usuario;
import ezwowm.ezwowm.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
    }

    public List<UsuarioDTO> devolverUsuarios(){  //Works
        try {
        List<Usuario> listaDeRepo = usuarioRepository.findAll();
        return convertToDTOList(listaDeRepo);
        }
        catch (RuntimeException e){
            return null;
        }
    }
    public UsuarioDTO devolverUsuarioPorDNI(Integer dni){
        Usuario usuario = usuarioRepository.findByDNI(dni);
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        try {
        BeanUtils.copyProperties(usuario,usuarioDTO);
        return usuarioDTO;
        }
        catch (RuntimeException e){
            return null;
        }
    }

    public boolean eliminarUsuarioPorDni(Integer dni){
        Integer deleteUser = usuarioRepository.deleteByDni(dni);
        if (deleteUser > 0 )
            return true;
        return false;
    }
    private List<UsuarioDTO> convertToDTOList(List<Usuario> userList) {
        return userList.stream()
                .map(user -> modelMapper.map(user, UsuarioDTO.class))
                .collect(Collectors.toList());
    }



}
