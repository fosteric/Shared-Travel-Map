import com.alidade.controller.DestinationController;
import com.alidade.model.Destination;
import com.alidade.repository.DestinationRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DestinationControllerTest {

    @InjectMocks
    private DestinationController dc;

    @Mock
    private DestinationRepository destinationRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testUserCreate() {
        Destination destination = new Destination();
        destination.setId(1L);
    }

    @Test
    public void testUserGet() {
        Destination destination = new Destination();
        destination.setId(1L);
        when(destinationRepository.findOne(1l)).thenReturn(destination);
        Destination destinationTest = dc.get(1L);
        verify(destinationRepository).findOne(1l);
        assertThat(destinationTest.getId(), is(1l));
    }
}