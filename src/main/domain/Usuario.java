import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "usuarios")
public class Usuario extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;
    
    private String passweord;
    private String rol;



}
