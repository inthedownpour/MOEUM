import React, { useRef } from 'react';
import { BrowserRouter as Router, Route, Routes, Navigate, } from 'react-router-dom';
import Record from './Record';
import MidiComponent from './MidiComponent';

function App() {
  return (
    <Router>
      <Routes>

        <Route path="/" element={<Navigate to="/record" />} />
        <Route path="/record" element={<Record />} />
        <Route path="/edit" element={<MidiComponent />} />
      </Routes>
    </Router>
  );
}

export default App;