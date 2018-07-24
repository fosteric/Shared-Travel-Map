import com.alidade.controller.LoginController;
import com.alidade.model.Login;
import com.alidade.repository.LoginRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginControllerTest {

    @InjectMocks
    private LoginController lc;

    @Mock
    private LoginRepository loginRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testUserCreate() {
        Login login = new Login();
        login.setId(1L);
    }

    @Test
    public void testUserGet() {
        Login login = new Login();
        login.setId(1L);
        when(loginRepository.findOne(1l)).thenReturn(login);
        Login loginTest = lc.get(1L);
        verify(loginRepository).findOne(1l);
        assertThat(loginTest.getId(), is(1l));
    }

}
