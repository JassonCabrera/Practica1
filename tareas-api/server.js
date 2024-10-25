const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
const PORT = 5000;

app.use(cors());
app.use(bodyParser.json());

let tasks = [];
let currentId = 1;

// Obtener todas las tareas
app.get('/tasks', (req, res) => {
    res.json(tasks);
});

// Crear una nueva tarea
app.post('/tasks', (req, res) => {
    const { title } = req.body;
    const newTask = { id: currentId++, title };
    tasks.push(newTask);
    res.status(201).json(newTask);
});

// Eliminar una tarea específica
app.delete('/tasks/:id', (req, res) => {
    const { id } = req.params;
    tasks = tasks.filter(task => task.id !== parseInt(id));
    res.status(204).send();
});

// Actualizar el título de una tarea específica
app.put('/tasks/:id', (req, res) => {
    const { id } = req.params;
    const { title } = req.body;
    const task = tasks.find(task => task.id === parseInt(id));
    if (task) {
        task.title = title;
        res.json(task);
    } else {
        res.status(404).send();
    }
});

app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});
