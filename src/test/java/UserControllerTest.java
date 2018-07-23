import com.alidade.user.UserController;
import com.alidade.user.User;
import com.alidade.user.UserRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    @InjectMocks
    private UserController uc;

    @Mock
    private UserRepository userRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testUserCreate(){
        User user = new User();
        user.setId(1L);
    }

    @Test
    public void testUserGet(){
        User user = new User();
        user.setId(1L);
        when(userRepository.findOne(1l)).thenReturn(user);
        User userTest = uc.get(1L);
        verify(userRepository).findOne(1l);
        assertThat(userTest.getId(), is(1l));
    }

}
