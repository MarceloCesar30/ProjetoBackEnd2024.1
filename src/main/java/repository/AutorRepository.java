package repository;

import org.springframework.data.jpa.repository.JpaRepository;

@repository
interface AutorRepository extends JpaRepositoryRepository<Autor, integer>{
}
