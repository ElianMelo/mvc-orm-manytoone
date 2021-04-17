package com.example.exerciciosemaula1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.exerciciosemaula1.domain.Book;
import com.example.exerciciosemaula1.domain.Library;
import com.example.exerciciosemaula1.domain.Post;
import com.example.exerciciosemaula1.domain.PostComment;
import com.example.exerciciosemaula1.domain.TodoList;
import com.example.exerciciosemaula1.domain.TodoListItem;
import com.example.exerciciosemaula1.repository.BookRepository;
import com.example.exerciciosemaula1.repository.LibraryRepository;
import com.example.exerciciosemaula1.repository.PostCommentRepository;
import com.example.exerciciosemaula1.repository.PostRepository;
import com.example.exerciciosemaula1.repository.TodoListItemRepository;
import com.example.exerciciosemaula1.repository.TodoListRepository;

@SpringBootApplication
public class ExerciciosEmAula1Application implements CommandLineRunner {
	
	@Autowired
	TodoListItemRepository todoItemRepo;
	
	@Autowired
	TodoListRepository todoRepo;
	
	@Autowired
	LibraryRepository libRepo;
	
	@Autowired
	BookRepository bookRepo;
	
	@Autowired
	PostCommentRepository commentRepo;
	
	@Autowired
	PostRepository postRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(ExerciciosEmAula1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {	
		TodoList td = new TodoList(null, "teste");
		
		TodoListItem item1 = new TodoListItem(null, "item1", td);
		TodoListItem item2 = new TodoListItem(null, "item2", td);
		TodoListItem item3 = new TodoListItem(null, "item3", td);
		TodoListItem item4 = new TodoListItem(null, "item4", td);
		
		td.getListaDeItens().add(item1);
		td.getListaDeItens().add(item2);
		td.getListaDeItens().add(item3);
		td.getListaDeItens().add(item4);
		
		todoRepo.save(td);
		
		todoItemRepo.save(item1);
		todoItemRepo.save(item2);
		todoItemRepo.save(item3);
		todoItemRepo.save(item4);
		
		/* ------------------------------------------------ */
		
		Library lib = new Library(null, "biblioteca");
		
		Book b1 = new Book(null, "livro1", lib);
		Book b2 = new Book(null, "livro1", lib);
		Book b3 = new Book(null, "livro1", lib);
		Book b4 = new Book(null, "livro1", lib);
		
		lib.getBooks().add(b1);
		lib.getBooks().add(b2);
		lib.getBooks().add(b3);
		lib.getBooks().add(b4);
		
		libRepo.save(lib);
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		bookRepo.save(b3);
		bookRepo.save(b4);
		
		/* ------------------------------------------------ */
		
		Post post = new Post(null, "PostFacebook");
		
		PostComment pc1 = new PostComment(null, post, "bom");
		PostComment pc2 = new PostComment(null, post, "legal");
		PostComment pc3 = new PostComment(null, post, "divertido");
		PostComment pc4 = new PostComment(null, post, "engraçado");
		
		post.addComment(pc1);
		post.addComment(pc2);
		post.addComment(pc3);
		post.addComment(pc4);
		
		postRepo.save(post);
		
		commentRepo.save(pc1);
		commentRepo.save(pc2);
		commentRepo.save(pc3);
		commentRepo.save(pc4);
		
		/*Optional<TodoList> buscaTarefas = todoRepo.findById(1);
		if(buscaTarefas.isPresent()) {
			TodoList aFazer = buscaTarefas.get();
			for(TodoListItem item : aFazer.getListaDeItens()) {
				System.out.println("-> " + item.getNomeDoItem());
			}
		}*/
	}

}
