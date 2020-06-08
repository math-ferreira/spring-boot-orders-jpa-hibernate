# spring-boot-orders-jpa-hibernate
Projeto criado para estudo de mapeamento objeto relacional com JPA e Hibernate no Spring. Desenvolvimento de aplicação para tabelas de produtos e pedidos para clientes

![image](https://user-images.githubusercontent.com/48540484/83987244-fa7b1880-a915-11ea-8a66-f59ee9cfce16.png)


	0. Pre-requisitos:
		- JPA dependencie (H2 to tests) e Driver SQL dependencie (pom.xml)
		- Ajust application.properties
	1. Basic attributes
	2. Associations (instantiate collections)
	3. Getters & Setters (collections: only get e posso usar LOMBOK)
	4. Constructors (default e using fields, not using collections)
	5. hashCode & equals (Por padrão usamos só o field Id para ser comparado)
	6. Serializable (usado para transformar o objeto em uma caderia de bytes, ie, para ser trafegado na rede, gravado em arquivo e etc..)
	7. Include annotation @Entity (import javax.persistence) and @Table(name="tb_name")
8. JPA mapping (relationship)
