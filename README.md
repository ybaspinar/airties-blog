
# Airties Bootcamp Graduation project

Graduation project for Techcareer.net and Airties Cloud Engineering Bootcamp.




## Acknowledgements

 - [Techcareer.net](https://www.techcareer.net/)
 - [Airties](https://airties.com/)
 - [Hamit Mızrak](https://github.com/hamitmizrak)


## API Reference

#### Get all items

```http
  GET /api/v1/blog/list
```
Returns all the blog data.

#### Get item

```http
  GET /api/v1/blog/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `long` | **Required**. Id of item to fetch |

```http
  POST /api/v1/blog/add
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `blogHeader`      | `string` | **Required**. header of the blog |
| `blogContent`      | `string` |  Content of the blog. |
| `blogImage`      | `string` | Link to the image source. |

```http
  PUT /api/v1/blog/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `blogHeader`      | `string` | **Required**. header of the blog |
| `blogContent`      | `string` |  Content of the blog. |
| `blogImage`      | `string` | Link to the image source. |

```http
  DELETE /api/v1/blog/${id}
```
Deletes blog with given id.




## Tech Stack

**Server:** Java, Spring Boot, Hibernate, Docker

