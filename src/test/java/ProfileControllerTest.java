import com.alidade.controller.ProfileController;
import com.alidade.model.Profile;
import com.alidade.repository.ProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ProfileControllerTest {

    @InjectMocks
    private ProfileController uc;

    @Mock
    private ProfileRepository profileRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testUserCreate(){
        Profile profile = new Profile();
        profile.setId(1L);
    }
//
//    @Test
//    public void testUserGet(){
//        Profile profile = new Profile();
//        profile.setId(1L);
//        when(profileRepository.findOne(1l)).thenReturn(profile);
//        Profile profileTest = uc.get(1L);
//        verify(profileRepository).findOne(1l);
//        assertThat(profileTest.getId(), is(1l));
//    }

}
