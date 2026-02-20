import OpenAI from 'openai';
import express from 'express';
import cors from 'cors';

const client = new OpenAI({
  apiKey: '본인의 API key',
});

const app = express();
const port = 3000;

//CORS 설정
app.use(cors());

// JSON 형식의 요청 본문을 처리하기 위해 미들웨어 추가
app.use(express.json());

// POST 요청을 처리하는 엔드포인트 생성
app.post('/chat', async (req, res) => {
  try {
    const userMessage = req.body.message;
    if (!userMessage) {
      return res.status(400).json({ error: 'message parameter is required' });
    }

    const chatCompletion = await client.chat.completions.create({
      messages: [{ role: 'user', content: userMessage }],
      model: 'gpt-4o-mini',
    });

    const responseMessage = chatCompletion.choices[0].message.content;
    res.json({ response: responseMessage });
  } catch (error) {
    console.error('Error processing request:', error);
    res.status(500).json({ error: 'Internal server error' });
  }
});

// 서버 시작
app.listen(port, () => {
  console.log(`Chat server is running on http://localhost:${port}`);
});
