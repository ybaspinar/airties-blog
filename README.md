
# Airties Bootcamp Graduation project

Graduation project for Techcareer.net and Airties Cloud Engineering Bootcamp.




## Acknowledgements

 - [Techcareer.net](https://www.techcareer.net/)
 - [Airties](https://airties.com/)
 - [Hamit Mızrak](https://github.com/hamitmizrak)


## API Reference

#### Get all blogs

```http
  GET /api/v1/blog/list
```
Returns all the blog data.

#### Get blog

```http
  GET /api/v1/blog/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of item to fetch |

#### Add blog

```http
  POST /api/v1/blog/add
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `blogHeader`      | `string` | **Required**. header of the blog |
| `blogContent`      | `string` |  Content of the blog. |
| `blogImage`      | `string` | Link to the image source. |

#### Update blog

```http
  PUT /api/v1/blog/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `blogHeader`      | `string` | **Required**. header of the blog |
| `blogContent`      | `string` |  Content of the blog. |
| `blogImage`      | `string` | Link to the image source. |

#### Delete item

```http
  DELETE /api/v1/blog/${id}
```
Deletes blog with given id.




## Tech Stack

**Server:** Java, Spring Boot, Hibernate, Docker

