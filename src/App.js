import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './App.css';

const App = () => {
    const [tasks, setTasks] = useState([]);
    const [title, setTitle] = useState('');
    const [editingTask, setEditingTask] = useState(null);

    useEffect(() => {
        fetchTasks();
    }, []);

    const fetchTasks = async () => {
        const response = await axios.get('http://localhost:5000/tasks');
        setTasks(response.data);
    };

    const addTask = async () => {
        if (!title) return;
        const response = await axios.post('http://localhost:5000/tasks', { title });
        setTasks([...tasks, response.data]);
        setTitle('');
    };

    const deleteTask = async (id) => {
        await axios.delete(`http://localhost:5000/tasks/${id}`);
        setTasks(tasks.filter(task => task.id !== id));
    };

    const updateTask = async () => {
        if (!editingTask || !title) return;
        const response = await axios.put(`http://localhost:5000/tasks/${editingTask.id}`, { title });
        setTasks(tasks.map(task => (task.id === editingTask.id ? response.data : task)));
        setEditingTask(null);
        setTitle('');
    };

    const startEditing = (task) => {
        setEditingTask(task);
        setTitle(task.title);
    };

    return (
        <div className='container'>
          <div className='header'>
            <h1>Gestor de Tareas</h1>
            <input
                type="text"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                placeholder=" "
            />
            <button onClick={editingTask ? updateTask : addTask}>
                {editingTask ? 'Update Task' : 'Add Task'}
            </button>
            </div>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    {tasks.map(task => (
                        <tr key={task.id}>
                            <td>{task.id}</td>
                            <td>{task.title}</td>
                            <td>
                                <button onClick={() => startEditing(task)}>Actualizar</button>
                                <button onClick={() => deleteTask(task.id)}>Eliminar</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
};

export default App;
